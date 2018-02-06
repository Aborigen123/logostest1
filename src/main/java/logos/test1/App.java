package logos.test1;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import classadd.Car;
import classadd.CarColor;
import classadd.CarEngineCapacity;
import classadd.CarFuelType;
import classadd.CarMake;
import classadd.CarModel;
import classadd.CarSeller;


/**
 * Hello world!
 *
 */
public class App {
    /**
     * @param args
     * @throws ParseException
     */
    public static void main( String[] args ) throws ParseException{
    	  EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql"); // mysql - назва з xml файлу
          EntityManager em = factory.createEntityManager();
          
          em.getTransaction().begin();
//          for(int i = 1; i<20; i++) {
//        	  
//        	  CarFuelType cft = new CarFuelType("Fuel" + i);
//        	  CarModel cm = new CarModel("Model" + i);
//        	  cm.setCarFuelType(cft);
//        	//  cft.setCarModel(new CarModel("Model" + i));
//        	  CarColor cr = new CarColor("Color" + i);
//        	  cm.setCarColor(cr);
//        	  //
//        	  cm.setCarEngineCapacity(new CarEngineCapacity(new BigDecimal(i+".99")));
//        	  //
////        1	  String date_s = " 2011";
////	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
////	  Date date = formatter.parse(date_s);
//	  /*
//                    	  SimpleDateFormat formatter1 =  new SimpleDateFormat("201"+ i);
//        	  Date date = new Date();
//		        SimpleDateFormat dateFormat = new SimpleDateFormat(
//		                "yyyy");
//		        String stringDate = dateFormat.format(date);
//		          Date dateStr = dateFormat.parse(stringDate);
//
//
//        	
//	  CarMake cma = new CarMake("CarMake" + i, dateStr);*/
//	  
//        	 // CarMake cma = new CarMake("CarMake" + i, formatter.parse("2011"));
//        	  //
//           
//        	  Date date = new Date();
//		        SimpleDateFormat dateFormat = new SimpleDateFormat(
//		                "yyyy");
//		        String stringDate = dateFormat.format(date);
//		        Date dateStr = dateFormat.parse(stringDate);
//
//        	//  Year year = Year.now();
//        	
//	  CarMake cma = new CarMake("CarMake" + i, dateStr);
//        	  cm.setCarMake(cma);
//        	  cma.setCarModel(cm);
//        	  //
//        	  Car car = new Car(new BigDecimal(i+".66"));
//        	  car.setCarMake(cma);
//        	  
//        	  
//        	  //
//        		CarSeller cs = new CarSeller("first" + i, "last" + i, i , i);
//        		car.setCarSeller(cs);
//        		car.setCarSeller(cs);
//        	  //
//        	  em.persist(cft);
//        	  em.persist(cr);
//        	  em.persist(cm);
//        	  em.persist(cs);
//        	  em.persist(cma);
//        	  em.persist(car);
//          }
          
         
          List<Car> car = em.createQuery("SELECT c FROM Car c", Car.class).getResultList();
          car.forEach(c -> System.out.println(c));
      
//          Long min =  em.createQuery("Select min(c.id) from Car c", Long.class).getSingleResult();
//        System.out.println("MIN = " + min);
          
//        List<CarMake> student = em.createQuery("Select t From car_make t where t.id like '%7' and t.id > :id", CarMake.class) 
//        		.setParameter("id", new Long(10)).getResultList();
//        student.forEach(t -> System.out.println(t)); 
          
          
          em.getTransaction().commit();
          em.close();
          factory.close();
    }}