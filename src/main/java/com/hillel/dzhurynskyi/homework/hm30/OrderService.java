package com.hillel.dzhurynskyi.homework.hm30;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/orders")
public class OrderService {
    OrderRepository orderRepository = new OrderRepository();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrderById(@PathParam("id") int id) {
        Order order = orderRepository.getById(id);
        if (order != null) {
            return Response.status(Response.Status.OK).entity(order).type(MediaType.APPLICATION_JSON).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrders() {

        List<Order> orders = orderRepository.getAllOrders();
        if (orders != null) {
            return Response.status(Response.Status.OK).entity(orders).type(MediaType.APPLICATION_JSON).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @GET
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String ping() {
        return "OK";
    }
}
