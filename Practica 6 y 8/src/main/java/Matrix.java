
//@author Escobar Rosales Luis Mario
public class Matrix{
    double[][] matriz;

    //Construye una matriz vacia de n por m
/**
/* Primer constructor de la clase Matrix
/* @param int n;  filas
/* @param int m;  columnas
/*Crea una matriz de dimensiones nxm y a cada casilla le asigna el valor 0 por ser int.
**/
    public Matrix(int n, int m){
	this.matriz= new double[n][m];
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
		this.matriz[i][j]=0;
		
	    }

	}
    }
    //Construye una matriz dado un arreglo
/**
/* Segundo constructor de la clase Matrix
/* @param double[][] array; arreglo bidimensional de la tipo double
/*Crea una matriz con las misma magnitudes del arreglo y le asigna los mismos valores
**/    
    public Matrix(double[][] array){
	matriz= new double[array.length][array[0].length];
	for(int i=0;i<this.matriz.length;i++){
	    for(int j=0;j<this.matriz[0].length;j++){
		this.matriz[i][j]=array[i][j];		
	    }

	}
    }
    //Funcion que calcula producto escalar
/**
/* Metodo scalarProduct
/* @param double scalar; numero por el que vamos a multiplicar cada casilla
/*Recorre cada posicion de la matriz y multiplica el valor que tenia por el double scalar.
**/    
    public void scalarProduct(double scalar){

	for(int i=0;i<this.matriz.length;i++){
	    for(int j=0;j<this.matriz[0].length;j++){
		this.matriz[i][j]=this.matriz[i][j]*scalar;		
	    }	    	
	}
    }
    //Funcion que calcula suma de matrices
/**
/* Primer constructor de la clase Matrix
/* @param Matrix m; recibe un objeto de la clase Matrix
/*Compara las longitudes de ambas matrices, en caso de que sean iguales realiza la suma de casillas de cada una, en caso contrario no se puede realizar la suma 
**/    
    public void add(Matrix m){
	if(this.matriz.length==m.matriz.length && this.matriz[0].length==m.matriz[0].length){
	    for(int i=0; i<this.matriz.length;i++){
		for(int j=0; j<this.matriz[0].length;j++){
		    this.matriz[i][j]=this.matriz[i][j]+m.matriz[i][j];	
		}	       
	    }
	}

    }
    //Funcion que calcula producto de matrices
/**
/* Metodo matrixProduct
/* @param Matrix m; recibe un objeto de la clase Matrix
/*Mediante 3 fors realizo el metodo de calcularlas sacado de la seccion generalizacion de la pagina https://www.problemasyecuaciones.com/matrices/multiplicar-matrices-producto-matricial-ejemplos-explicados-propiedades-matriz.html 
**/    
    public void matrixProduct(Matrix m){
	double[][] resp= new double[this.matriz.length][m.matriz[0].length];
	double suma=0;
	int aux=0;
	int aux2=0;
	if(this.matriz[0].length==m.matriz.length){
	    for(int i=0;i<this.matriz.length;i++){
		for(int j=0; j<this.matriz[i].length;j++){
		    resp[i][j]+=this.matriz[i][j]*m.matriz[j][i];
		    for(int z=0;z<this.matriz[0].length;z++){
			resp[i][j]+=this.matriz[i][z]*m.matriz[z][j];
		    }
		}
	    }
	    this.matriz=resp; 	
	}		
	else{
	    System.out.println("No se pueden multiplicar estas matrices");
	}
	
    }
/**
/* Metodo getElement
/* @param int i; posicion de la fila de donde queremos sacar el elemento
/*@param int j; posicion de la columna de donde queremos obtener el elemento
/* Regresa el valor de la matriz en la posicion [i][j]
/* Devuelve un double
**/     
    //Funcion que obtiene el elemento i j
    public double getElement(int i, int j){
	return this.matriz[i][j];	    
    }
    //function set element
/**
/* Metodo setElement
/* @param int i; posicion de la fila de donde queremos sacar el elemento
/*@param int j; posicion de la columna de donde queremos obtener el elemento
@param double e; el valor que vamos a cambiar en la posicion matriz[i][j]
/*Cambia el valor de la matriz en la posicion matriz[i][j] por el valor de e 
**/     
    public void setElement(int i, int j,double e){
	for(int l=0;l<this.matriz.length;l++){
	    for(int k=0;k<this.matriz[0].length;k++){
		if(l==i && k==j){
		    this.matriz[i][j]=e;		
		}
	    }
	}
    }
    //Funcion que calcula el determinante si es nxn
/**
/* Metodo determinant
/* Metodo que calcula la determinante de una matriz nxn 
/* Devuelve un double
**/     
    public double determinant(){

        for(int k=0; k<this.matriz.length-1; k++){
            for(int i=k+1; i<this.matriz.length; i++){
                for(int j=k+1; j<this.matriz.length; j++){
                    this.matriz[i][j]-=this.matriz[i][k]*this.matriz[k][j]/this.matriz[k][k];
                }
            }
        }
        double deter=1.0;
        for(int i=0; i<this.matriz.length; i++){
            deter*=this.matriz[i][i];
        }
        return deter;
    }
    
/**
/* metodo equals de tipo boolean 
/* @param  objeto de la clase Matrix
/* Compara la longitud de ambas matrices, en caso de ser iguales compara cada una de la casilla de los elementos, en caso de ser iguales regresa true, en caso opuesto regresa false
**/
    public boolean equals(Matrix o){

	if(this.matriz.length==o.matriz.length && this.matriz[0].length==o.matriz[0].length){
	    for(int i=0; i<this.matriz.length;i++){
		for(int j=0; j<this.matriz[0].length;j++){
		    if(this.matriz[i][j]!=o.matriz[i][j]){
			return false;
		    }
		}
	    }
	    return true;
	}
	else{
	    return false;
	}
	

    }
}