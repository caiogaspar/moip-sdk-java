package br.com.moip;

import br.com.moip.api.InvoiceAPI;
import br.com.moip.api.OrderAPI;
import br.com.moip.api.PaymentAPI;

public class API {

    private final Client client;

    public API(final Client client) {
        this.client = client;
    }

    public OrderAPI order() {
        return new OrderAPI(client);
    }

    public PaymentAPI payment(){
        return new PaymentAPI(client);
    }

    public InvoiceAPI invoice() {
        return new InvoiceAPI(client);
    }

}
