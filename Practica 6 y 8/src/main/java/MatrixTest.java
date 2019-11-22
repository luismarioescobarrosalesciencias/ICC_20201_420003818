/**
/*@author Escobar Rosales Luis Mario 
/*Clase MatrixTests:
**/
public class MatrixTest{
    
    public static void scalarProduct_test(double scalar, Matrix b){
	double [][] fin={{0.0,0.0,0.0,0.0},{0.0,0.5,1.0,1.5},{0.0,1.0,2.0,2.0}} ;
	Matrix finn=new Matrix(fin);
	b.scalarProduct(scalar);
	if(b.equals(finn)){
	    System.out.println("ScalarProduct Va bien");
	}
	else{
	    System.out.println("ScalarProduct Va mal");
	}
	    
	

    }
/**
/*Metodo add_test
/*@param Matriz a; objeto de la clase Matrix
/* Metodo que pone a prueba el metodo add de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void add_test(Matrix a){
	double [][] array= {{0.0,0.0,0.0,0.0},{0.0,1.0,2.0,3.0},{0.0,2.0,4.0,4.0}};
	Matrix comparacion= new Matrix(array);
	a.add(a);
	if(a.equals(comparacion)){
	    System.out.println(" add esta funcionando");
	}
	else{
	    System.out.println("Algo falló");
	}
       
    }
/**
/*Metodo matrixProduct_test
/* Metodo que pone a prueba el metodo matrixProduct  de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void matrixProduct_test(){
	
	double arreglo[][]={{2.0,0.0,1.0},{3.0,0.0,0.0},{5.0,1.0,1.0}};
	Matrix c= new Matrix(arreglo);
	double arreglo1[][]={{1.0,0.0,1.0},{1.0,2.0,1.0},{1.0,1.0,0.0}};
	double arregRes[][]={{5.0,1.0,3.0},{3.0,0.0,3.0},{12.0,4.0,6.0}};
	Matrix resp=new Matrix(arregRes);
	Matrix d= new Matrix(arreglo1);
	c.matrixProduct(d);
	if(c.equals(resp)){
	    System.out.println(" MatrixProduct Bien");
	}
	else{
	    System.out.println(" MatrixProduct falló");
	}
    }
/**
/*Metodo setElement_test
/* Metodo que pone a prueba el metodo setElement  de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/        
    public static void setElement_test(){

	Matrix s= new Matrix (2,2);
	int j=1;
	int i=1;
	double r=10.5;
	s.setElement(i,j,r);
	double comp=s.getElement(i,j);
	
	if(comp==r){
	    System.out.println(" SetElement Nice");
	}
	else{
	    System.out.println("SetElement :C");
	}
	
    }
    /**
/*Metodo getElement_test()
/* Metodo que pone a prueba el metodo getElement de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void getElement_test(){

	double arreglo[][]={{2.0,0.0,1.0},{3.0,0.0,0.0},{5.0,1.0,10.0}};
	Matrix c= new Matrix(arreglo);

	if(c.getElement(2,2)==10){
	    System.out.println(" GetElement Goodjob");
	}
	else{
	    System.out.println("Chale");
	}

    }
/**
/*Metodo determinant__test
/* Metodo que pone a prueba el metodo determinant de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void determinant_test(){

	double[][] arrDet={{2.0,-3.0,1.0},{-3.0,5.0,7.0},{1.0,7.0,-1.0}};
	Matrix mDet= new Matrix(arrDet);
	double resp=-146;
	double respDet=mDet.determinant();
	if(resp==respDet){
	    System.out.println(" Determinant funciona");
	}
	else{
	    System.out.println("oDeterminant no funcionó -.-");
	}
    }
    public static void equals_test(Matrix a, Matrix b){
	if(a.equals(b)==false && a.equals(a)==true){
	    System.out.println("Equals si sirve");

	}
	else{
	    System.out.println("Equals valio ****");
	}
    }
/**
/*Metodo main
/* Metodo que se ejecuta y manda a llamar a cada uno de los metodos test, tambien aqui se crean algunos objetos de la clase Matrix y unos valores que utlice en varios metodos de esta clase.
**/    
    public static void main(String[] args) {
	int n=6;
	int m=6;
	Matrix a= new Matrix(n,m);
	double [][] array= {{0,0,0,0},{0,1,2,3},{0,2,4,4}};
	Matrix b= new Matrix(array);
        scalarProduct_test(.5,b);
        add_test(b);
        matrixProduct_test();
        setElement_test();
        getElement_test();
        determinant_test();
        equals_test(b,a);
    }
}