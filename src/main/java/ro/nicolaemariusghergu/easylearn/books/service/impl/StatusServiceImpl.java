package ro.nicolaemariusghergu.easylearn.books.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import ro.nicolaemariusghergu.easylearn.books.dto.StatusDTO;
import ro.nicolaemariusghergu.easylearn.books.mapper.StatusMapper;
import ro.nicolaemariusghergu.easylearn.books.repository.StatusRepository;
import ro.nicolaemariusghergu.easylearn.books.service.StatusService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;
    private final WebClient webClient;

    @Override
    public List<StatusDTO> getStatusFromRemote() {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/status-types/v1")
                        .build())
                .retrieve()
                .bodyToFlux(StatusDTO.class)
                .collectList()
                .block();
    }

    @Transactional
    @Override
    public void saveStatuses(List<StatusDTO> statuses) {
        statusRepository.saveAllAndFlush(statuses.stream()
                .map(StatusMapper.INSTANCE::statusDtoToStatus)
                .collect(Collectors.toSet()));
    }
}
