---
tags:
- developer
- faq
---

# Developer FAQs

----------------------------

## How to start Janssen Server OpenBanking testing?

!!! Note
    - Use this steps for testing.
    - Good understanding of Janssen Server installation process in general is a prerequisite. Here we are just highlighting steps without a lot of details. Visit [installation](../admin/install/README.md) documentation for complete understanding.


This installation uses Gluu Testing certificate.
### Device Authentication

after installation run below command it will launch CLI and access any of option it will ask for device authentication,
redirect to given url and add code to complete authentication.

```
 /opt/jans/jans-cli/config-cli.py -CC /opt/jans/jans-setup/output/CA/client.crt -CK /opt/jans/jans-setup/output/CA/client.key
```

### IM mode

```
 /opt/jans/jans-cli/config-cli.py -CC /opt/jans/jans-setup/output/CA/client.crt -CK /opt/jans/jans-setup/output/CA/client.key
```
run this command to launch IM mode.
further testing is same as jans-cli IM testing.
[IM](../admin/config-guide/jans-cli/im/im-attribute.md)


### Manual command 

```
Ex: 
/opt/jans/jans-cli/config-cli.py -CC /opt/jans/jans-setup/output/CA/client.crt -CK /opt/jans/jans-setup/output/CA/client.key --info Attribute
```
same way we can run other command 
further testing is same as jans testing.
[commandline](../admin/config-guide/jans-cli/cli-attribute.md)
