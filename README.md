
# deutschland-api-sdk-java

This [SDK](https://github.com/apioo/deutschland-api-sdk-java) is managed by the [SDK Fabric](https://sdk-fabric.org/) project, a global infrastructure to
automatically generate SDKs for every API.

You can find more information about this SDK at [TypeHub](https://typehub.cloud/):
https://app.typehub.cloud/d/deutschland-api/sdk

## Usage

```java
import dev.deutschlandapi.sdk.Client;

Client client = Client::build("[access_token]");

// Returns user data of the current authenticated user.
Backend_User response = client.authorization().getWhoami();

// Revoke the access token of the current authenticated user.
Common_Message response = client.authorization().revoke();

// Returns available charging stations for a specific autobahn.
AutobahnChargingStationCollection response = client.autobahn().charging_station().getAll("autobahn_id");

// Returns available closures for a specific autobahn.
AutobahnClosureCollection response = client.autobahn().closure().getAll("autobahn_id");

// Returns all available autobahns.
AutobahnCollection response = client.autobahn().getAll();

// Returns available parking lorries for a specific autobahn.
AutobahnParkingLorryCollection response = client.autobahn().parking_lorry().getAll("autobahn_id");

// Returns available warnings for a specific autobahn.
AutobahnWarningCollection response = client.autobahn().warning().getAll("autobahn_id");

// Returns expense for the provided year.
BudgetCollection response = client.budget().expense().getAll("year");

// Returns income for the provided year.
BudgetCollection response = client.budget().income().getAll("year");

// Returns all current members of the Bundesrat.
BundesratMemberCollection response = client.bundesrat().member().getAll();

// Returns a specific member of the Bundestag.
BundestagMember response = client.bundestag().member().get("member_id");

// Returns all current members of the Bundestag.
BundestagMemberCollection response = client.bundestag().member().getAll();

// Returns a specific city.
City response = client.city().get("city_id");

// Returns all available cities.
CityCollection response = client.city().getAll(1, "state", "district", "name", "zipCode");

// Returns a specific district.
District response = client.district().get("district_id");

// Returns all available districts.
DistrictCollection response = client.district().getAll(1, "state", "name");

// Returns all available hospitals.
HospitalCollection response = client.hospital().getAll(1, "search");

// Returns all available jobs.
JobCollection response = client.job().getAll(1, "search", "location", "employer");

// Returns meta information and links about the current installed Fusio version.
System_About response = client.meta().getAbout();

// Returns all Tagesschau news.
NewsCollection response = client.news().getAll(1);

// Returns a specific state.
State response = client.state().get("state_id");

// Returns all available states.
StateCollection response = client.state().getAll(1, "name");

// Returns all available warnings from the modular warning system (MoWaS).
WarningCollection response = client.warning().getAll();
```
