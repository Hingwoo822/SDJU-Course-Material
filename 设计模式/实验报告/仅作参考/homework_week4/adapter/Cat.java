/***********************************************************************
 * Module:  Cat.java
 * Author:  zzc20
 * Purpose: Defines the Class Cat
 ***********************************************************************/
package adapter;
import java.util.*;

/** @pdOid ffbf29b8-6a73-4855-aa83-039e03b37080 */
public class Cat implements Icat {
   /** @pdOid abd3dbc4-9553-4b06-86b8-c5b537926fcb */
   public void catCry() {
      System.out.println("��");
   }
   
   /** @pdOid 72042224-8e48-4f00-b335-931f3b3d9011 */
   public void catchMouse() {
	   System.out.println("ץ����");
   }

}