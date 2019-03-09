# DSplend Java SDK 

## Prerequisites
- Java 1.8 or higher
- Maven 3.5.0 or higher

# ![](https://storage.googleapis.com/material-icons/external-assets/v4/icons/svg/ic_directions_run_black_24px.svg) Setup and Run
- `git clone https://github.com/splend-io/dsplend-java.git`<br>
- `cd dsplend-java`<br>
- `build.sh`<br>
- Make sure to set `-Djava.library.path=...secp256k1/.libs`

## Sample

~~~java
        System.out.println("DSplend SDK Example");
        try {
            Sdk sdk = new Sdk("127.0.0.1");
            List<Contact> contacts = sdk.getDelegates();
            Account fromAccount = sdk.createAccount();
            Account toAccount = sdk.createAccount();
            Receipt receipt = sdk.transferTokens(contacts.get(0), fromAccount, toAccount, 45);
            System.out.println(receipt.getStatus());

            // Pending?
            while ((receipt = sdk.getLastStatus()).getStatus().equals(Receipt.Status.PENDING)) {
                Thread.sleep(100);
            }
            System.out.println(receipt.getStatus());

            // Get transactions.
            List<Transaction> transactions = sdk.getTransactions(contacts.get(0));
            System.out.println(transactions);
        } catch (Throwable t) {
            System.out.println(t);
        }
~~~

