# TP6

## Notes à organiser

transformer l'enum produit en classe et y ajouter un id
creer une interface produitDAO 
ajouter les méthodes add, remove, update, initialisation
ajouter une classe produitDAOMock qui implémente produitDAO en singleton avec lastId statique et une map<id, produit>
déplacer les fonctions statiques de l'ancien enum dans cette classe, le code vous servira pour la suite.
initialisation ajoutera via la méthode add les mêmes produits que vous avez déjà dans vos machines, puis affichera dans la console le nombre de produits ajoutés en utilisant les méthodes du DAO
ajouter la méthode loadProductsFromType qui prendra en paramètre le type et retournera la liste des produits correspondants
loadAllProducts à implémenter
countAllProducts
countProductsFromType
soyez malins, utilisez les fonctions que vous implémentez

pour rappel un singleton est une classe 
- dont le constructeur est privé
- qui possède un attribut statique de son propre type
- qui fourni un getter sur cet attribut dont le but est de l'instancier s'il est null, sinon de le retourner
le but de ce design pattern est de n'avoir qu'une seule instance de la classe et d'utiliser les méthodes fournies par cette instance plutôt que via des méthodes statiques. La seule méthode statique est donc le getter de l'instance qui assure que le new n'est exécuté qu'une seule fois.

## Idées pour le contrôle final

mince j'ai oublié de commiter cette partie, so bad
