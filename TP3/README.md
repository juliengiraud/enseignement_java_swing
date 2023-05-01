# TP3 - TODO

Le but de ce TP est de mettre en pratique les fenêtres de dialogue de Swing, les combobox, la sélection de fichier et les menus.

## 1. Fenêtres de dialogue

### 1.1 Remplacer la fenêtre du sucre

Remplacer la modale yesNo par une fenêtre de dialogue Swing

### 1.2 Permettre de recharger les gobelets

Ajouter un bouton "recharger les gobelets" sur la machine à café qui utilise une fenêtre de dialogue afin de saisir le nombre de gobelets à remettre dans la machine

## 2. Sélection de l'article à commander

Ajouter une combobox afin de sélectionner l'article de la commande

## 3. Gestion des images de produits

### 3.1 Ajout d'une image par article

Ajouter une image dans l'enum des articles (l'adresse du fichier depuis la racine du projet)

Afficher cette image dans les interfaces une fois un article sélectionné

### 3.2 Ajout de la possibilité de modifier les images

Ajouter un bouton "changer l'image de l'article"

Utiliser la sélection de fichier pour que ça fonctionne avec JFileChooser

## Ajout d'une barre de menu

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
