package br.com.easyfisco.persistence.entity;

public enum GenrerJpaEntity {
    FEMALE("Feminino"),
    MALE("Masculino"),
    UNINFORMED("Não Informado");

    private final String description;

    GenrerJpaEntity(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
