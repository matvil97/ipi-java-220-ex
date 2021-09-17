
paquet  com.ipiecoles.java.java220 ;

        importer  org.joda.time.LocalDate ;
        importer  org.joda.time.LocalDate ;

        importer  java.util.Objects ;

        classe abstraite  publique Employe {

        nom de chaîne privé ;

        privé  Chaîne prenom;

        matricule de String privé ;

        privé  LocalDate dateEmbauche;

        privé  Double salaire =  Entreprise . SALAIRE_BASE ;

        Employé public () {

        }

public  Employe ( String  nom , String  prenom , String  matricule , LocalDate  dateEmbauche , Double  salaire ) {
        ça . nom = nom;
        ça . prenom = prenom;
        ça . matricule = matricule;
        ça . dateEmbauche = dateEmbauche;
        ça . salaire = salaire ;
        }

public  final  Entier  getNombreAnneeAnciennete () {
        renvoie  LocalDate . maintenant() . getYear() - dateEmbauche . getAnnée();
        }

public  Entier  getNbConges () {
        retour  Entreprise . NB_CONGES_BASE ;
        }

        résumé  public Double  getPrimeAnnuelle ();

public  void  augmenterSalaire ( Double  pourcentage ) {
        ça . salaire =  ceci . getSalaire() * ( 1  + pourcentage);
        }

        /**
         * @retourner le nom
         */
        chaîne  publique getNom () {
        retour nom;
        }

/**
 * @param nom le nom à définir
 */
public  void  setNom ( String  nom ) {
        ça . nom = nom;
        }

/**
 * @retourner le prenom
 */
public  String  getPrenom () {
        retour prénom;
        }

/**
 * @param prenom le prénom à définir
 */
public  void  setPrenom ( String  prenom ) {
        ça . prenom = prenom;
        }

/**
 * @retourner le matricule
 */
public  String  getMatricule () {
        retour matricule;
        }

/**
 * @param matricule la matricule à paramétrer
 */
public  void  setMatricule ( String  matricule ) {
        ça . matricule = matricule;
        }

/**
 * @retourner la dateEmbauche
 */
public  LocalDate  getDateEmbauche () {
        date de retourEmbauche;
        }

/**
 * @param dateEmbauche la dateEmbauche à définir
 * @lance l' exception
 */
public  void  setDateEmbauche ( LocalDate  dateEmbauche ) lève une  exception {
        if (dateEmbauche !=  null  && dateEmbauche . isAfter( LocalDate . now())) {
        throw  new  Exception ( " La date d'embauche ne peut être postérieure à la date courante " );
        }
        ça . dateEmbauche = dateEmbauche;
        }

/**
 * @retourner le salaire
 */
public  Double  getSalaire () {
        retourner le salaire ;
        }

/**
 * @param salaire le salaire à fixer
 */
public  void  setSalaire ( Double  salaire ) {
        ça . salaire = salaire ;
        }

@Passer outre
        chaîne  publique toString () {
final  StringBuilder sb =  new  StringBuilder ( " Employe{ " );
        sb . append( " nom=' " ) . ajouter(nom) . append( ' \' ' );
        sb . append( " , prenom=' " ) . ajouter(prénom) . append( ' \' ' );
        sb . append( " , matricule=' " ) . annexe (matricule) . append( ' \' ' );
        sb . append( " , dateEmbauche= " ) . append(dateEmbauche);
        sb . append( " , salaire= " ) . annexe(salaire);
        sb . ajouter( ' } ' );
        retour sb . toString();
        }

@Passer outre
public  boolean  equals ( Objet  o ) {
        if ( this  == o) renvoie  true ;
        if ( ! (o instanceof  Employe )) return  false ;

        Employe employe = ( employe ) o;

        if ( Double . compare( employe . salaire, salaire) !=  0 ) return  false ;
        if (nom !=  null  ?  ! nom . equals(employe . nom) : employe . nom !=  null ) return  false ;
        si (prenom =!  null  ?  ! prenom . égal à égal (employee . prenom) : employé . prenom ! =  null ) retour  faux ;
        if (matricule !=  null  ?  ! matricule . equals(employe . matricule) : employe . matricule !=  null ) return  false ;
        date de retourEmbauche !=  nul  ? dateEmbauche . égal( employe . dateEmbauche) : employe . dateEmbauche ==  null ;

        }

@Passer outre
public  int  hashCode () {
        renvoyer des  objets . hash(nom, prenom, matricule, dateEmbauche, salaire);
        }
        }