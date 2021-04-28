package br.com.easyfisco.domain.model;

public enum Genrer {
    FEMALE("Feminino"),
    MALE("Masculino"),
    UNINFORMED("Não Informado");

    private final String description;

    Genrer(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
