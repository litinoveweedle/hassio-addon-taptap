[MQTT]
SERVER = {{ .mqtt_server }}
PORT = {{ .mqtt_port }}
QOS = {{ .mqtt_qos }}
TIMEOUT = {{ .mqtt_timeout }}
USER = {{ .mqtt_user }}
PASS = {{ .mqtt_pass }}


[TAPTAP]
BINARY = ./taptap
{{ if .taptap_serial }} 
SERIAL = {{ .taptap_serial }} 
ADDRESS =
{{ else if .taptap_address }}
SERIAL =
ADDRESS = {{ .taptap_address }}
{{ else }}
SERIAL =
ADDRESS =
{{ end }}
{{ if .taptap_port }}
PORT = {{ if .taptap_port }}
{{ else }}
PORT = 502
{{ end }}
MODULE_IDS = {{ .taptap_module_ids }}
MODULE_NAMES = {{ .taptap_module_names }}
TOPIC_PREFIX = {{ .taptap_topic_prefix }}
TOPIC_NAME = {{ .taptap_topic_name }}
{{ if .taptap_timeout }}
TIMEOUT = {{ .taptap_timeout }}
{{ else }}
TIMEOUT = 180
{{ end }}
{{ if .taptap_update }}
UPDATE = {{ .taptap_update }}
{{ else }}
UPDATE = 10
{{ end }}


[HA]
{{ if .ha_discovery_prefix }}
DISCOVERY_PREFIX = {{ .ha_discovery_prefix }}
{{ else }}
DISCOVERY_PREFIX = homeassistant
{{ end }}
{{ if .ha_birth_topic }}
BIRTH_TOPIC = {{ .ha_birth_topic }}
{{ else }}
BIRTH_TOPIC = homeassistant/status
{{ end }}
{{ if .ha_entity_availability }}
ENTITY_AVAILABILITY = {{ .ha_entity_availability }}
{{ else }}
ENTITY_AVAILABILITY = true
{{ end }}


[RUNTIME]
MAX_ERROR = 0
STATE_FILE = /run/taptap/taptap.state
