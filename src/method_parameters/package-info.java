/**
 * The number of method parameters is limited to 255 by the definition of a
 * method descriptor (§4.3.3), where the limit includes one unit for this in
 * the case of instance or interface method invocations.
 * 
 * Note that a method descriptor is defined in terms of a notion of method
 * parameter length in which a parameter of type long or double contributes two
 * units to the length, so parameters of these types further reduce the limit.
 */
/**
 * @author vincentlee
 * @since August 12, 2014
 * @version 1.0
 */
package method_parameters;