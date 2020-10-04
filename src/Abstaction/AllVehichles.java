/*Interface is used to achieve strictly 0-100% abstraction
 *We can not write concrete methods in interface
 *We can write concrete methods in java10
 * 
 */
package Abstaction;

public interface AllVehichles
{
	final int i=10;
	public void setColor(String colorName);
	//but in java 10 we can write concrete method inn interface
	public void setMaterial(String materialType);
    public void setNumberOfLamps();

}
 
 