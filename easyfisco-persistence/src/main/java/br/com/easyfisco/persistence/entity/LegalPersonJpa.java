package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "legal_person")
public class LegalPersonJpa extends PersonJpaEntity {
    @Column(name = "cnpj", unique = true)
    private String cnpj;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "trading_name")
    private String tradingName;

}
