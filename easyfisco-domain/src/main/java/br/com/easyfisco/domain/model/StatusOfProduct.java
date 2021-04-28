package br.com.easyfisco.domain.model;

public enum StatusOfProduct {
    ACTIVED("Ativo"), INACTIVED("Dasativado");

    private final String description;

    StatusOfProduct(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
