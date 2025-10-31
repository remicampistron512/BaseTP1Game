# BaseTP1Game – Jeu de devinette en Java (1 à 100)

Cette application Java est un petit **jeu de devinette** dans la console : le programme choisit un nombre aléatoire entre 1 et 100 et vous devez le trouver. Après chaque proposition, il vous indique si votre nombre est **trop petit** ou **trop grand**. Quand vous avez trouvé, il vous propose de **rejouer**.

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Règles-du-jeu](#règles-du-jeu)
- [Fonctionnalités](#fonctionnalités)
- [Structure-du-code](#structure-du-code)

## Installation

1. **Prérequis** : avoir le **JDK (Java Development Kit)** installé (version 8 ou +).
2. Téléchargez le fichier `BaseTP1Game.java`.
4. Compilez :

   ```bash
   javac BaseTP1Game.java
   ```

5. Exécutez :

   ```bash
   java BaseTP1Game
   ```

## Utilisation

1. Au lancement, le programme demande :

   ```text
   Voulez vous jouer à un jeu ? (Oui ou Non) :
   ```

   * Tapez `Oui`, `oui` ou `o` pour jouer.
   * Toute autre réponse → le programme s’arrête.

2. Le programme tire alors **un nombre aléatoire** entre 1 et 100.

3. Il vous demande :

   ```text
   Saisir un nombre entre 1 et 100
   ```

4. Vous entrez un nombre. Le programme répond :

   * **“Le nombre donné est inférieur au nombre à trouver”** → il faut entrer plus grand
   * **“Le nombre donné est supérieur au nombre à trouver”** → il faut entrer plus petit
   * **“Bravo, vous avez trouvé le nombre en X coups”** → gagné 🎉

5. Après avoir trouvé, le programme demande :

   ```text
   Voulez-vous continuer ? (Oui ou Non) :
   ```

   * Si **oui** → il relance une nouvelle partie avec un nouveau nombre
   * Si **non** → quitte la partie


## Règles du jeu

1. Le joueur doit **accepter de jouer** pour lancer la partie.
2. Le programme choisit **un nombre secret** entre 0 et 99 (logique actuelle).
3. Le joueur doit entrer **un entier**.
4. Le programme indique si la proposition est **trop basse** ou **trop haute**.
5. Quand le joueur trouve le bon nombre → il gagne et le programme indique **le nombre d’essais**.
6. Le joueur peut **enchaîner plusieurs parties** sans relancer le programme.

## Fonctionnalités

* ✅ Question d’entrée : “Voulez vous jouer à un jeu ?”
* ✅ Tirage aléatoire d’un nombre
* ✅ Boucle de jeu : saisie → comparaison → indice
* ✅ Comptage du **nombre d’essais**
* ✅ Possibilité de **rejouer** sans quitter le programme
* ✅ Messages en **français**
* 🧪 Affichage du nombre cible (utile pour tester / débugguer)


## Structure du code

* **Classe principale :** `BaseTP1Game`

  * Contient la méthode `public static void main(String[] args)`.

* **Étapes de `main` :**

  1. Création d’un `Scanner` pour lire les entrées clavier.
  2. Demande à l’utilisateur s’il veut jouer.
  3. Si oui :

     * initialisation du compteur d’essais `triesNb`
     * génération du nombre à trouver : `Math.floor(Math.random() * 100)`
     * boucle de saisie utilisateur `while (scan.hasNextInt())`
     * pour chaque saisie :

       * comparaison avec le nombre à trouver
       * affichage d’un indice
       * incrémentation du compteur
       * si trouvé → message + proposition de rejouer
  4. Si non → fermeture du scanner et sortie.

* **Variables importantes :**

  * `Scanner scan` : lit les réponses de l’utilisateur
  * `String play` : sait si on joue / rejoue
  * `int triesNb` : compte les coups
  * `double targetNumber` : le nombre à deviner 

