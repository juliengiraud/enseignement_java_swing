# TP6 - Chargement des produits depuis une base de données SQLight

## 1. Ajout de la librairie

Allez sur la page Github de SQLight et téléchargez le .jar de la dernière release <https://github.com/xerial/sqlite-jdbc/releases>

Puis ajoutez ce fichier .jar à vos dépendances.

### Sur IntelliJ

Dans le menu : File > Project structure, onglet gauche SDK, onglet en haut Classpath, cliquer sur le petit +.

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

Maintenant que nous avons un singleton, nous somme sûr qu'il n'y aura qu'une seule connexion à la base de données.

Pour créer cette connexion, ajouter un attribut de classe connection de type Connection.

Dans le constructeur, au sein d'un bloc try catch, initialisez la connexion avec la ligne suivante : `connection = DriverManager.getConnection("jdbc:sqlite:sample.db");`

Une fois la connexion initialisée, affichez un message puis appelez la méthode initialisation, vide pour l'instant.

En cas d'échec, affichez un message également.

### L'initialisation de la base de données

La méthode initialisation essaie de créer la table product et d'y ajouter vos produits. Si la table existe déjà (si la création plante), elle n'ajoute pas de produits mais indique combien d'éléments se trouvent dans la table. On peut imaginer un booléen `initAnayway` qui permette de supprimer la table si elle existe, à des fins de débug.

Voici quelques commandes SQL sur lesquels vous baser pour la création et le remplissage de la table, rajoutez tout ce qui sera nécessaire :

```sql
drop table if exists product;
create table product (id integer primary key AUTOINCREMENT, caption string, type string);
insert into product (caption, type) values('Café', 'MACHINE_A_CAFE');
```

Affichez des messages afin de savoir si la création de la table a fonctionné, idem pour l'insertion des données.

### Exploitation de la base

Le but est d'implémenter toutes les fonctions qui permettrons de faire fonctionner votre application en gérant les produits à partir de la base de données.

Commencez par `loadProductsFromMachineType` puis ajoutez les éventuelles méthodes qu'il vous manque pour que le programme compile.

## Utilisation de ProductDAO

Afin de vous servir de votre DAO, instanciez votre DAO spécifique de la façon suivante et utilisez les méthodes fournies par votre interface :

```java
ProductDAO productDAO = ProductDAOSQLight.getInstance();
List<Product> produits = productDAO.loadProductsFromMachineType(TypeMachine.MACHINE_A_CAFE);
…
```
