# TP3 - Passer commande et recharger la machine

Le but de ce TP est de mettre en pratique les fenêtres de dialogue de Swing, les combobox, la sélection de fichier et les menus.

> Tous les éléments de code nécessaires pour réaliser ce TP sont dans les diapos des cours 1 à 3.

## 1. Fenêtres de dialogue

### 1.1 Remplacer la fenêtre du sucre

Remplacer la modale yesNo par une fenêtre de dialogue Swing.

### 1.2 Permettre de recharger les gobelets

Ajouter un bouton "Recharger les gobelets" sur l'interface de la machine à café. Ce bouton déclenche l'ouverture d'une fenêtre de dialogue qui permettra de de saisir le nombre de gobelets à remettre dans la machine. Le stock de gobelets affiché sur l'interface doit changer.

## 2. Passage de la commande

Ajouter une combobox dans `InterfaceMachine` afin de sélectionner l'article de la commande. Faites en sorte qu'un click sur le bouton commander affiche un message dans la console avec le nom du produit (exemple `Commande : Café`).

## 3. Gestion des images de produits

### 3.1 Ajout d'une image par produit

Dans l'enum `Produit` :

- ajouter un attribut image de type String dans l'enum product
- ajouter cet attribut au constructeur
- ajouter les adresses d'images dans les produits
- ajouter un getter sur l'attribut

Dans `InterfaceMachine`, afficher l'image du produit sélectionné par la combobox.

### 3.2 Ajout de la possibilité de modifier les images

Dans la même interface, ajouter un bouton "Modifier l'image".

Vous utiliser la sélection de fichier afin de récupérer l'adresse de la nouvelle image avec un JFileChooser.

Ajoutez un setter dans l'enum `Product` afin de modifier l'image d'un produit puis mettez à jour l'image.

## 4. Ajout d'une barre de menu

- ajouter un menu avec :
  - un onglet "Fenêtre" avec :
    - un item pour quitter la fenêtre, qui ferme la fenêtre
  - un onglet "Maintenance" avec :
    - un item radio "Mode normal" par défaut, tel que le bouton "Recharger les gobelets" disparaisse
    - un item radio "Mode maintenance" tel que le bouton apparaisse
    - une barre de menu
    - un item "Réinitialiser la machine" tq tous les stocks soient de nouveau à 10

Les items doivent être ajoutés dans le même ordre que listé ci-dessus

Idéalement d'autres parties des interfaces devraient être cachées en "mode normal", si votre structure de code permet de le faire facilement alors ajoutez les composants liés à la maintenance de la machine
