import java.io.BufferedReader;
import java.io.FileReader;
import weka.associations.Apriori;

import weka.core.Instances;

public class CoveringAlgorithm {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C:/Users/cst15053/Desktop/weather.arff"); // Location of the arff file
		Instances instance_train = new Instances(reader); //create an instance
		BufferedReader fi = new BufferedReader(reader); //read the file and pass data to buffer
		fi.close();
		instance_train.setClassIndex(4);
		
		Apriori c = new Apriori();
		String []options= {"-N 15", "-C 1.0"};
		c.setOptions(options);
		c.buildAssociations(instance_train);
		
		System.out.print(c.toString());
		

	}

}
