
# DeutschlandAPI SDK

This SDK helps to access the [DeutschlandAPI](https://deutschland-api.dev)

## Usage

The following example shows how you initialize the client:

```java
import DeutschlandAPI.SDK;

Client client = Client::buildAnonymous();
StateCollection collection = client.state().getAll();

for (State state : collection.getEntries()) {
    System.out.println(state.getName()); 
}

```

More information about the complete API at:
https://app.typehub.cloud/d/deutschland-api/sdk
