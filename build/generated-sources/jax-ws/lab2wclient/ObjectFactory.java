
package lab2wclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lab2wclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://web.lab3/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://web.lab3/", "addResponse");
    private final static QName _GetAllMessage_QNAME = new QName("http://web.lab3/", "getAllMessage");
    private final static QName _GetAllMessageResponse_QNAME = new QName("http://web.lab3/", "getAllMessageResponse");
    private final static QName _GetMessage_QNAME = new QName("http://web.lab3/", "getMessage");
    private final static QName _GetMessageResponse_QNAME = new QName("http://web.lab3/", "getMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lab2wclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetAllMessage }
     * 
     */
    public GetAllMessage createGetAllMessage() {
        return new GetAllMessage();
    }

    /**
     * Create an instance of {@link GetAllMessageResponse }
     * 
     */
    public GetAllMessageResponse createGetAllMessageResponse() {
        return new GetAllMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.lab3/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.lab3/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.lab3/", name = "getAllMessage")
    public JAXBElement<GetAllMessage> createGetAllMessage(GetAllMessage value) {
        return new JAXBElement<GetAllMessage>(_GetAllMessage_QNAME, GetAllMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.lab3/", name = "getAllMessageResponse")
    public JAXBElement<GetAllMessageResponse> createGetAllMessageResponse(GetAllMessageResponse value) {
        return new JAXBElement<GetAllMessageResponse>(_GetAllMessageResponse_QNAME, GetAllMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.lab3/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.lab3/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

}
