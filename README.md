# Taller
Instrucciones de instalación
 Microsoft JDBC Driver 6.0 para SQL Server en Eclipse


INTRODUCCIÓN
------------
A continuación se incluyen las instrucciones para desempaquetar sqljdbc_<versión>_enu.exe y sqljdbc_<versión>_enu.tar.gz.


WINDOWS Y/O LINUX, MAC
-------
1. Lea el archivo license.txt. La descarga y el uso de Microsoft JDBC Driver 6.0 para SQL Server implican la aceptación de esta licencia.

2. Descargue sqljdbc_<versión>_enu.exe en un directorio temporal.

3. Ejecute sqljdbc_<versión>_enu.exe

4. Escriba el directorio de instalación cuando se le pida; se recomienda desempaquetar

este archivo zip en %ProgramFiles% con el directorio predeterminado:

	Microsoft JDBC DRIVER 6.0 para SQL Server
5-Abrimos eclipse

6-En el proyecto que queremos usar, lo seleccionamos, boton derecho "Build Path"

7-Configure Build Patch

8-Add External JarS

9-Buscamos la carpeta y el archivo seleccionado sqljdbc42  (seleccionamos carpeta jre8 o 7 segun versión)

10-Si tenemos una versión anterior, debemos elminarla seleccionando y marcamos remove.

11-Apply y Ok


***Para Evitar tener que ir modificando y añadiendo la libreria en la ruta correspondiente, no debemos hacer nunca commit de >.classpath***
