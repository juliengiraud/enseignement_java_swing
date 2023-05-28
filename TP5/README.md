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
