package ro.nicolaemariusghergu.easylearn.books.dto;

import lombok.*;
import ro.nicolaemariusghergu.easylearn.books.model.dao.AbstractEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(callSuper = true)
public class PriceTypeDTO extends AbstractEntity {

    private String value;
}
