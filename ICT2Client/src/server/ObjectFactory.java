
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _Exception_QNAME = new QName("http://server/", "Exception");
    private final static QName _IsConnectedResponse_QNAME = new QName("http://server/", "isConnectedResponse");
    private final static QName _IsConnected_QNAME = new QName("http://server/", "isConnected");
    private final static QName _GetLongestStringOnServerResponse_QNAME = new QName("http://server/", "getLongestStringOnServerResponse");
    private final static QName _AddSampleOnServer_QNAME = new QName("http://server/", "addSampleOnServer");
    private final static QName _GetLongestStringBetween_QNAME = new QName("http://server/", "getLongestStringBetween");
    private final static QName _GetLongestStringBetweenResponse_QNAME = new QName("http://server/", "getLongestStringBetweenResponse");
    private final static QName _GetLongestStringBetweenWithException_QNAME = new QName("http://server/", "getLongestStringBetweenWithException");
    private final static QName _GetLongestStringBetweenWithExceptionResponse_QNAME = new QName("http://server/", "getLongestStringBetweenWithExceptionResponse");
    private final static QName _AddSampleOnServerResponse_QNAME = new QName("http://server/", "addSampleOnServerResponse");
    private final static QName _GetLongestStringOnServer_QNAME = new QName("http://server/", "getLongestStringOnServer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLongestStringOnServer }
     * 
     */
    public GetLongestStringOnServer createGetLongestStringOnServer() {
        return new GetLongestStringOnServer();
    }

    /**
     * Create an instance of {@link AddSampleOnServerResponse }
     * 
     */
    public AddSampleOnServerResponse createAddSampleOnServerResponse() {
        return new AddSampleOnServerResponse();
    }

    /**
     * Create an instance of {@link AddSampleOnServer }
     * 
     */
    public AddSampleOnServer createAddSampleOnServer() {
        return new AddSampleOnServer();
    }

    /**
     * Create an instance of {@link GetLongestStringBetween }
     * 
     */
    public GetLongestStringBetween createGetLongestStringBetween() {
        return new GetLongestStringBetween();
    }

    /**
     * Create an instance of {@link GetLongestStringBetweenResponse }
     * 
     */
    public GetLongestStringBetweenResponse createGetLongestStringBetweenResponse() {
        return new GetLongestStringBetweenResponse();
    }

    /**
     * Create an instance of {@link GetLongestStringBetweenWithException }
     * 
     */
    public GetLongestStringBetweenWithException createGetLongestStringBetweenWithException() {
        return new GetLongestStringBetweenWithException();
    }

    /**
     * Create an instance of {@link GetLongestStringBetweenWithExceptionResponse }
     * 
     */
    public GetLongestStringBetweenWithExceptionResponse createGetLongestStringBetweenWithExceptionResponse() {
        return new GetLongestStringBetweenWithExceptionResponse();
    }

    /**
     * Create an instance of {@link GetLongestStringOnServerResponse }
     * 
     */
    public GetLongestStringOnServerResponse createGetLongestStringOnServerResponse() {
        return new GetLongestStringOnServerResponse();
    }

    /**
     * Create an instance of {@link IsConnected }
     * 
     */
    public IsConnected createIsConnected() {
        return new IsConnected();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link IsConnectedResponse }
     * 
     */
    public IsConnectedResponse createIsConnectedResponse() {
        return new IsConnectedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnectedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnectedResponse")
    public JAXBElement<IsConnectedResponse> createIsConnectedResponse(IsConnectedResponse value) {
        return new JAXBElement<IsConnectedResponse>(_IsConnectedResponse_QNAME, IsConnectedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnected }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnected")
    public JAXBElement<IsConnected> createIsConnected(IsConnected value) {
        return new JAXBElement<IsConnected>(_IsConnected_QNAME, IsConnected.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringOnServerResponse")
    public JAXBElement<GetLongestStringOnServerResponse> createGetLongestStringOnServerResponse(GetLongestStringOnServerResponse value) {
        return new JAXBElement<GetLongestStringOnServerResponse>(_GetLongestStringOnServerResponse_QNAME, GetLongestStringOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSampleOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addSampleOnServer")
    public JAXBElement<AddSampleOnServer> createAddSampleOnServer(AddSampleOnServer value) {
        return new JAXBElement<AddSampleOnServer>(_AddSampleOnServer_QNAME, AddSampleOnServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringBetween }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringBetween")
    public JAXBElement<GetLongestStringBetween> createGetLongestStringBetween(GetLongestStringBetween value) {
        return new JAXBElement<GetLongestStringBetween>(_GetLongestStringBetween_QNAME, GetLongestStringBetween.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringBetweenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringBetweenResponse")
    public JAXBElement<GetLongestStringBetweenResponse> createGetLongestStringBetweenResponse(GetLongestStringBetweenResponse value) {
        return new JAXBElement<GetLongestStringBetweenResponse>(_GetLongestStringBetweenResponse_QNAME, GetLongestStringBetweenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringBetweenWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringBetweenWithException")
    public JAXBElement<GetLongestStringBetweenWithException> createGetLongestStringBetweenWithException(GetLongestStringBetweenWithException value) {
        return new JAXBElement<GetLongestStringBetweenWithException>(_GetLongestStringBetweenWithException_QNAME, GetLongestStringBetweenWithException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringBetweenWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringBetweenWithExceptionResponse")
    public JAXBElement<GetLongestStringBetweenWithExceptionResponse> createGetLongestStringBetweenWithExceptionResponse(GetLongestStringBetweenWithExceptionResponse value) {
        return new JAXBElement<GetLongestStringBetweenWithExceptionResponse>(_GetLongestStringBetweenWithExceptionResponse_QNAME, GetLongestStringBetweenWithExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSampleOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addSampleOnServerResponse")
    public JAXBElement<AddSampleOnServerResponse> createAddSampleOnServerResponse(AddSampleOnServerResponse value) {
        return new JAXBElement<AddSampleOnServerResponse>(_AddSampleOnServerResponse_QNAME, AddSampleOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringOnServer")
    public JAXBElement<GetLongestStringOnServer> createGetLongestStringOnServer(GetLongestStringOnServer value) {
        return new JAXBElement<GetLongestStringOnServer>(_GetLongestStringOnServer_QNAME, GetLongestStringOnServer.class, null, value);
    }

}
