package ro.nicolaemariusghergu.easylearn.books.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ro.nicolaemariusghergu.easylearn.books.model.dao.AbstractEntity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class PublishHouseDTO extends AbstractEntity {

    private String name;
}
