---
tags:
  - administration
  - config-api
---

# config-api

## Overview
[Jans Config Api](https://github.com/JanssenProject/jans/tree/main/jans-config-api) provides a central place to manage and configure modules.
Config API is a REST application that is developed using Weld 4.x (JSR-365) and JAX-RS. Its endpoints can be used to manage configuration and other properties of [Jans Auth Server] (https://github.com/JanssenProject/jans/tree/main/jans-auth-server), which is an open-source OpenID Connect Provider (OP) and UMA Authorization Server (AS)
![Config-API-Architecture](../../../assets/config-api-architecture.png)

If you want to learn more about Weld, please visit its website: https://weld.cdi-spec.org/

## Packaging and running the application
The application can be packaged using `./mvnw package`.
It produces the `jans-config-api.war` file in the `server/target` directory.
Be aware that all the dependencies are copied into the `server/target/jans-config-api/WEB-INF/lib` directory.

## Endpoints protection
ConfigPAI endpoints are OAuth 2.0 protected. It supports simple bearer and JWT token.

## Documentation
Learn more in the [jans-config-api documentation](https://gluu.org/swagger-ui/?url=https://raw.githubusercontent.com/JanssenProject/jans/main/jans-config-api/docs/jans-config-api-swagger.yaml).

