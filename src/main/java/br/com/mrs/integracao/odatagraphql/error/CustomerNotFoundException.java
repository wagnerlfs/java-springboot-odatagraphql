package br.com.mrs.integracao.odatagraphql.error;

import graphql.GraphQLException;

public class CustomerNotFoundException extends GraphQLException {
    public CustomerNotFoundException() {
        super("customer-not-found");
    }
}
