
package lab2wclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IDemoImpl", targetNamespace = "http://web.lab3/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IDemoImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMessage", targetNamespace = "http://web.lab3/", className = "lab2wclient.GetAllMessage")
    @ResponseWrapper(localName = "getAllMessageResponse", targetNamespace = "http://web.lab3/", className = "lab2wclient.GetAllMessageResponse")
    @Action(input = "http://web.lab3/IDemoImpl/getAllMessageRequest", output = "http://web.lab3/IDemoImpl/getAllMessageResponse")
    public List<String> getAllMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://web.lab3/", className = "lab2wclient.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://web.lab3/", className = "lab2wclient.AddResponse")
    @Action(input = "http://web.lab3/IDemoImpl/addRequest", output = "http://web.lab3/IDemoImpl/addResponse")
    public boolean add(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessage", targetNamespace = "http://web.lab3/", className = "lab2wclient.GetMessage")
    @ResponseWrapper(localName = "getMessageResponse", targetNamespace = "http://web.lab3/", className = "lab2wclient.GetMessageResponse")
    @Action(input = "http://web.lab3/IDemoImpl/getMessageRequest", output = "http://web.lab3/IDemoImpl/getMessageResponse")
    public String getMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
