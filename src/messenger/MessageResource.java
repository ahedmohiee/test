package messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;


@Path("messenger")
public class MessageResource {
    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages(){
           return  messageService.getAllMessages();
        }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessages(Message message){
        
        return messageService.addMessage(message);
    }
    @PUT
    @Path("{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageId") long messageId,Message message){
        message.setId(messageId);
        return messageService.updateMessage(message);
        }
    @DELETE
    @Path("{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message deleteMessage(@PathParam("messageId") long messageId,Message message){
        return messageService.removeMessage(messageId);
        
    }

    @GET
    @Path("{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") long messageId){
      return   messageService.getMessage(messageId);
//           return  "go to parm"+messageId;
        }
}
