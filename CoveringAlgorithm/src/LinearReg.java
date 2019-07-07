import java.io.BufferedReader;
import java.io.FileReader;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;

public class LinearReg {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("C:/Users/cst15053/Desktop/weatherN.arff"); // location of the arff file
		Instances instance_train = new Instances(reader); //create an instance
		BufferedReader fi = new BufferedReader(reader); //read the file and pass data to buffer
		fi.close();
		instance_train.setClassIndex(1);
		
		LinearRegression lr = new LinearRegression();
		lr.buildClassifier(instance_train);
		
		System.out.print(lr);
		
	}

}
