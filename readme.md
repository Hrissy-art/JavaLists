# ArrayList

## Définition :
`ArrayList` est une structure dynamique basée sur un tableau redimensionnable.

## Caractéristiques :
- **Non synchronisée** : Elle n'est pas thread-safe, ce qui la rend plus rapide en contexte monothread.
- **Accès rapide aux éléments grâce aux indices** : Les éléments peuvent être accédés rapidement via leur indice dans la liste.

## Avantages :
- **Performante pour les applications monothreads** : Parce qu'elle n'est pas synchronisée, elle est plus rapide dans les contextes où il n'y a pas de concurrence.
- **Accès efficace grâce aux indices** : Permet d'accéder directement aux éléments via leur position, ce qui est rapide.

## Inconvénients :
- **Non synchronisée** : Elle n'est pas adaptée pour les environnements multithreads où la sécurité des données est cruciale.
- **Le redimensionnement du tableau peut causer des overheads** : Si la capacité initiale est mal ajustée, le redimensionnement (reallocation de mémoire) peut entraîner des coûts de performance.

---

## Exercices sur ArrayList

### Exercice 1 : Manipuler ArrayList (Facile)
#### Objectif :
Créer et manipuler une `ArrayList` en ajoutant, supprimant, et accédant aux éléments.

#### Énoncé :
1. Crée une `ArrayList` de chaînes de caractères pour stocker des noms de villes.
2. Ajoute les villes suivantes : “Paris”, “Londres”, “Berlin”, “New York”.
3. Affiche la liste complète.
4. Supprime “Berlin” de la liste.
5. Ajoute “Tokyo” à la fin de la liste.
6. Affiche la ville située à la 2e position.

---

### Exercice 2 : Manipuler ArrayList (Difficile)
#### Objectif :
Optimiser l’usage d’une `ArrayList` pour des données dynamiques.

#### Énoncé :
1. Crée une `ArrayList` d’entiers pour stocker des températures journalières.
2. Générez 30 températures aléatoires entre 10°C et 35°C.
3. Affiche la liste des températures.
4. Trie les températures en ordre croissant et affiche-les.
5. Calcule la température moyenne et affiche-la.
6. Identifie les jours où la température est supérieure à 30°C.

---

## Résumé des cas d'usage :

`ArrayList` est idéal pour :

- Les **applications monothreads** où la synchronisation n'est pas nécessaire.
- Les situations où l'**accès aux éléments via les indices** est fréquent.
- Les **collections dynamiques** où la taille de la collection peut varier pendant l'exécution.
