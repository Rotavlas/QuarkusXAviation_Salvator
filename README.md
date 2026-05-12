# Quarkus x Aviation

Exercice de gestion de flotte aérienne réalisé avec le framework **Quarkus**.

## Technologies
- **Backend** : Quarkus (Java)
- **Base de données** : Oracle DB (via conteneur Podman)
- **ORM** : Hibernate avec Panache
- **Frontend** : Quarkus Qute (Vanilla CSS, sans librairie externe)

## Fonctionnalités
- API REST retournant des données au format JSON.
- Interface Web élégante avec rendu côté serveur (SSR).
- Consultation des compagnies aériennes et des modèles d'avions.
- Détails techniques des moteurs et répartition des flottes.

## Lancement

### Prérequis
- Podman (ou Docker)
- Java 21+

### Démarrage
1. **Lancer la base de données** Oracle via Podman :
   ```bash
   podman run -d -p 1521:1521 --name oracle gvenzl/oracle-free
   ```
2. **Lancer l'application Quarkus** en mode développement :
   ```bash
   ./mvnw quarkus:dev
   ```
3. Accéder au site web sur : **http://localhost:8080/web**
