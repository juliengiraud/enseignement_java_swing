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

Vous allez ajouter une barre de menu dans la fenêtre principale `InterfaceMachine`, le but est d'ajouter quelques contrôles pour rendre l'interface plus réaliste.

Il faut :

- un onglet "Fenêtre" avec :
  - un item pour quitter la fenêtre, qui ferme la fenêtre
- un onglet "Maintenance" avec :
  - un item radio "Mode normal" par défaut, tel que les composants "non admin" disparaissent
  - un item radio "Mode maintenance" tel que les composants "admin" apparaissent
  - une barre de menu
  - un item "Réinitialiser la machine" qui remet tous les stocks à 10

Les items doivent être ajoutés dans le même ordre que listé ci-dessus.

Pour la notion de composants "admin" / "non admin" vous pouvez utiliser une liste de composants admin (`List<Component>`) et itérer sur celle-ci afin d'appeler la méthode setVisible pour tous les mettre à jour.

Afin de réinitialiser les stocks, ajoutez une méthode dans `Machine` qui pour chaque produit remet 10 dans la variable de stocks et surchargez-la dans `MachineACafe` afin d'appeler la méthode parente via `super` ET de remettre 10 dans les stocks de gobelets.
