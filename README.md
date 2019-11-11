# M223: Punchclock
Dies ist ein kleines Projekt, was sich vom Punchclock ableitet

## Loslegen
Folgende Schritte befolgen um loszulegen:
- Sicherstellen, dass JDK 12 installiert und in der Umgebungsvariable `path` definiert ist.

Folgende Dienste stehen während der Ausführung im Profil `dev` zur Verfügung:
- REST-Schnittstelle der Applikation: http://localhost:8081
- Dashboard der H2 Datenbank:\ http://localhost:8081/h2-console
- http://localhost:8081 wird einen Fehler geben: Whitelabel Error Page, da man nicht authentifiziert.
- Startseite/ Home: http://localhost:8080/index.html 

- Beispieldaten werden im /Config Initialize generiert
- Im /security sind alle JWT Files vorhanden

## Beschreibung der Applikation
- Die Applikation beinhaltet ein Login
- Es gibt eine Maske für die User und eine separate für den Admin.
- Auf der Usermaske, kann man einen neuen Eintrag erstellen und der CheckIn und CheckOut Datum setzen
- Auf der Adminmaske, kann man User hinzufügen, verändern und löschen
- Ausserdem kann man sich wieder ausloggen und der JWT wird anschliessend gelöscht

Es werden 2 User erstellt:
1. User 1
- Username: user
- Passwort: user
1. User 2
- Username: admin
- Passwort: admin