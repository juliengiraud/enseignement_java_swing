# TP6 - Chargement des produits depuis une base de données SQLight

## 1. Ajout de la librairie

Allez sur la page Github de SQLight et téléchargez le .jar de la dernière release <https://github.com/xerial/sqlite-jdbc/releases>

Puis ajoutez ce fichier .jar à vos dépendances.

### Sur IntelliJ

Dans le menu : File > Project structure, onglet classpath (ouvert par défaut), cliquer sur le petit +.

### Sur Netbeans

Dans le menu : Tools > Librairies, cliquer sur le bouton Add JAR/Folder.

### Sur VS-Code

Voir cette page https://stackoverflow.com/questions/50232557/visual-studio-code-java-extension-how-to-add-a-jar-to-classpath

## Travail à réaliser dans Product

- commentez tout le code qui retourne des produits
- passez le constructeur de `private` à `public`
- changer `enum` par `class`

## ProductDAO

Ensuite ajoutez une interface ProductDAO avec les méthodes suivantes :

```java
void create(Product product);
void update(Product product);
void initialisation();
List<Product> loadProductsFromMachineType(TypeMachine type);
List<Product> loadAllProducts();
```

## ProductDAOSQLight

Ajoutez une classe `ProductDAOSQLight` qui implémente `ProductDAO` avec un design pattern **singleton**.

### Le design pattern Singleton

Nous allons commencer par le singleton, pour qu'il fonctionne votre classe a besoin :

- d'un constructeur privé,
- d'un attribut statique de son propre type (dans notre cas, `instance` de type `ProductDAO`),
- qui fourni un getter statique sur cet attribut (`getInstance`) dont le but est de l'instancier s'il est null (avec un `new`), et de le retourner dans tous les cas (`return instance`).

Le but de ce design pattern est de n'avoir qu'une seule instance de la classe et d'utiliser les méthodes/fonctions fournies par cette instance plutôt que via des méthodes/fonctions statiques. La seule fonction statique est donc le getter de l'instance qui assure que le new n'est exécuté qu'une seule fois.

### La connexion à la base de données

TODO à faire dans le constructeur

### L'initialisation de la base de données

TODO à faire dans la méthode d'initialisation appelée par le constructeur
+ ajout d'articles

+ le loadProductsFromMachineType
