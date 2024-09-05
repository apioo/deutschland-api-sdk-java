
# DeutschlandAPI SDK

This SDK helps to access the [DeutschlandAPI](https://deutschland-api.dev)

## Usage

The following example shows how you initialize the client:

```java
import DeutschlandAPI.SDK;

Client client = Client::buildAnonymous();

for (City city : client.city().getAll()) {
    System.out.println(city.getState()); 
}

```

More information about the complete API at:
https://app.typehub.cloud/d/deutschland-api/sdk
