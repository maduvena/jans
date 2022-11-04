# OAuth - OpenID Connect - Clients
OpenID Connect - Client encapsulates a dynamically registered, discovered or instantiated OpenID Connect Client (Client), Relying Party (RP), and its metadata, its instances hold the methods for getting an authorization URL, consuming callbacks, triggering token endpoint grants, revoking and introspecting tokens.
Config API endpoint allows admin to create amd mange OpenID Connect.

HTTP operations supported
- GET : Allows to serach OpenID Client based on filters and unique identifier.
- POST : Create a new OpenID Client.
- PUT : Updates new OpenID Client.
- PATCH: Allows to apply partial updates to OpenID Client.

## GET - Gets list of OpenID Connect clients
*path:* /jans-config-api/api/v1/openid/clients
![Parameters]
| Name      | Type | Description |
| ----------- | ----------- |
| limit      | Title       |
| Paragraph   | Text        |


![Response](https://github.com/JanssenProject/jans/raw/main/docs/assets/config-api/openid-client-json1.png)
(https://github.com/JanssenProject/jans/raw/main/docs/assets/config-api/openid-client-json2.png)


