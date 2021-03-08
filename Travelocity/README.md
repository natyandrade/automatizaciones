# Devco – Travelocity: Automatización Web

_Travelocity es una automatización Web para un reto Devco, donde se realizaron 15 escenarios manuales y 5 escenarios automatizados de la pagina web https://www.travelocity.com/.
El proyecto de las pruebas automatizadas se llama Travelocity y el proyecto de las pruebas automatizadas manuales se llama Travelocity_manual._


## Construido con 🛠️

_Estas fueron las tecnologias que se utilizaron para el desarrollo de las automatizaciones:_

•	Gradle 5.6.2
•	Serenity BDD 1.9.9
•	Cucumber
•	Chrome 81.0.4044.92 (64 bits)
•	Driver Chrome 81, java 1.8.0_241


### Pre-requisitos 📋

_Como precondición para ejecutar los escenarios de Login y Create account de las preubas automatizadas es necesario solicitar a desarrollo desactivar reCaptcha._


## Ejecutando las pruebas ⚙️

_El proyecto de las pruebas automatizadas se llama Travelocity y el proyecto de las pruebas automatizadas manuales se llama Travelocity_manual._


### Ejecutando las Pruebas Manuales 🔩

_-	Pasos a seguir si se desea ejecutar desde un IDE: 

1. Ir a la carpeta del proyecto Travelocity_manual.
2. Ir a la carpeta Runner.
3. Ejecutar cada archivo Runner: dando click derecho y seleccionar la opción RunAs, luego seleccionar la opción JUnitTest. 
4. A continuacion, el programa pregunta si los pasos son exitosos, responder si o no, según el caso y al final marcará el escenario como fallido o exitoso.

-	Pasos a seguir si se desea ejecutar desde la terminal: 

1. Ingresar a la carpeta del proyecto Travelocity_manual.
2. Ubicados ahi, ejecutar la terminal y escribir gradle build.
3. Esperamos que descargue las dependencias y realice las ejecuciones de las pruebas._


### Ejecutando las Pruebas Automatizadas ⌨️

_Pasos a seguir si se desea ejecutar desde un IDE: 

1. Ir a la carpeta del proyecto Travelocity.
2. Ir a la carpeta Runner.
3. Ejecutar cada archivo Runner, dando click derecho y seleccionando la opción RunAs, luego seleccionar la opción JUnitTest.
4. A continuacion, el programa ejecuta el escenario.

-	Pasos a seguir si se desea ejecutar desde la terminal: 

1. Ingresar a la carpeta del proyecto Travelocity.
2. Ubicados ahi, ejecutar la terminal y escribir gradle build.
3. Esperamos que descargue las dependencias y realice las ejecuciones de las pruebas.

-	Pasos a seguir si se desea ejecutar desde la terminal todas las pruebas:

1. Se ejecuta desde un IDE o Proyecto ya abierto.
2. Ubicados dentro de la carpeta principal Travelocity del proyecto, abrimos la terminal.
3. Abrimos el proyecto con cualquier ide y descargamos las dependencias
4. Escribimos el siguiente comando gradlew clean test aggregate, esto hace que se ejecuten todas las pruebas.
5. Esperamos que las pruebas se completen.
6. Dentro del proyecto se genera la carpeta Target con el contenido del reporte target\site\serenity\index.html._


## Informe de Serenity 📦

_Dentro del proyecto se genera el informde de Serenity. En la carpeta Target se evidenciara el contenido del reporte: target\site\serenity\index.html_


## Autora ✒️

* **Natali Andrade** - *Automatizadora de Pruebas* - [natyandrade](https://github.com/natyandrade/automatizaciones)


## Muchas Gracias 🎁


---
⌨️ con ❤️ por [natyandrade](https://github.com/natyandrade) 😊
