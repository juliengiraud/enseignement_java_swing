# TP5 - Features diverses et JTable

## 1. Features diverses

### 1.1 Changement du nom d'un produit

Dans l'interface de sélection du produit, ajoutez un textfield qui affiche le caption du produit sélectionné. En mode normal, faites en sorte que le textfield ne soit pas éditable. En mode maintenance, faites en sorte qu'on puisse l'éditer et mettez à jour le nouveau caption dans l'enum des produits.

### 1.2 Amélioration de la saisie du stock

Dans la modale de saisie du stock de gobelet à recharger, faites en sorte que les espaces autour du montant saisie soient enlevés. Renseignez-vous sur la fonctions `trim`.

### 1.3 Commander un café frappé

Dans la même interface que précédemment, ajoutez un bouton qui affiche un emoji main ou marteau. Ajoutez un tooltip sur ce bouton avec le texte "Cliquer pour frapper le café". Faites en sorte qu'un clique sur ce bouton déclenche le son d'un marteau ou d'une claque, et remplace l'article sélectionné par un *café frappé*.

Pour ne pas y passer trop de temps, vous pouvez ajouter le produit *café frappé* dans la liste des produits et le sélectionner lors d'un clique sur le bouton.

Idéalement l'article *café frappé* n'est pas visible dans la liste des articles et la seule façon de l'obtenir est de cliquer sur le bouton pendant que la barre de chargement se remplie suite à la commande d'un *café*, cette partie est optionnelle.

### 1.4 Utiliser une JListe

Remplacez la combobox de sélection des produits par une JListe qui fonctionne de la même façon, faites en sorte d'ajouter une scrollbar à cette JListe.

Dans un second temps, permettez de sélectionner plusieurs articles. Faites en sorte que pour chaque article commandé la barre de chargement soit déclenchée une fois et pendant son chargement, on doit voir l'image du produit en cours de préparation. Pensez aussi à réduire le stock de chaque produit commandé.

Exemple : je sélectionne un café et un cappuccino, je clique sur commander, je vois l'image du café et la barre de chargement charge de 0 à 100, puis je vois l'image du cappuccino pendant que la barre de chargement recommence.

## 2 Historique des commandes

### 2.1 JTable avec des données mockées

En mode maintenance sur l'interface principale (ou sans mode si vous n'en avez pas), rajoutez un bouton "Historique" qui ouvre une nouvelle fenêtre avec une JTable.

Cette JTable utilisera une JScrollPane et affichera des historiques de commandes de la façon suivante :

| Nom machine | Position | Article | Quantité | Admin | Date |
| ----------- | -------- | ------- | -------- | ----- | ---- |
| Pissenlit | Dept info | Café | 1  | Non | 2023-05-31 10:57:43 |
| Pissenlit | Dept info | Cappuccino | 1  | Non | 2023-05-31 10:57:43 |
| Bob       | Dept geii | Café | 1  | Non | 2023-05-31 10:57:43 |
| Pissenlit | Dept info | Chocolat chaud | 1  | Non | 2023-05-31 10:57:43 |

Faites en sorte de pouvoir éditer le nom de la machine, changer la position par combobox en affichant toutes les positions existantes, changer l'article par combobox en utilisant les différents articles de la colonne, et modifier la case admin avec une checkbox. La colonne de date ne doit pas être modifiable, et elle doit être deux fois plus large que les autres colonnes.

Insérez les valeurs vous même à l'instantiation de la table et faites fonctionner les features de modification.

### 2.2 Données dynamiques

Une fois que votre table fonctionne, branchez l'historique sur votre machine à café et faites en sorte que la table se mette à jour lorsque vous passez des commandes.

Testez.
