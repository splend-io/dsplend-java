package dsplend.states;

import dsplend.utils.AJson;

/**
 *
 */
public class Contact extends AJson {

    /**
     * Class level-declarations.
     */
    private String address;
    private Endpoint endpoint;

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     *
     * @param endpoint
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }
}
