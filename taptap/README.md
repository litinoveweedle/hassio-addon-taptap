# Home Assistant Add-on: taptap - Tigo CCA to MQTT

Tigo CCA Tap to MQTT implementation to get data from Tigo optimizers locally to Home Assistant

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]
![Supports armhf Architecture][armhf-shield]
![Supports armv7 Architecture][armv7-shield]
![Supports i386 Architecture][i386-shield]

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[i386-shield]: https://img.shields.io/badge/i386-yes-green.svg


## How to use

- requires MQTT server (you can use Home Assistant Mosquitto broker addon)
- requires configured Home Assistant MQTT integration
- requires Modbus to Ethernet convertor (optionaly Modbus to USB/Serial dongle)
    - set Modbus communication to 38400b, databits 8, stopbits 1, Flow control None
    - set convertor mode to Modbus TCP Server
    - remember IP address and TCp port of converter to set in the addon configuration later
- Modbus convertor has to connected to Tigo CCA gateway
  - connect convertor to connector named Gateway on Tigo CCA gateway
  - there will be already wires in this connector from the connected Tigo Tap
  - connect convertor together with existing wires from Tigo Tap
  - use 3 wires - A, B and Ground, connect A to A, B to B, Groud to Ground
  - wires shall be as short as possible - mount your convertor close to the Tigo CCA gateway