/*
 * Copyright (C) 2020 alan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.freeboxos.ftb.metier.rest.server.config;

import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.config.ConfigTypeMemoireService;
import fr.freeboxos.ftb.metier.entitys.config.ConfigTypeMemoire;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author alan
 */
@Path("/ConfigTypeMemoireService")
@Consumes("application/json")
@Produces("application/json")
public class ConfigTypeMemoireRestImpl {

    private final ConfigTypeMemoireService configTypeMemoireService = MetierFactory.getConfigTypeMemoireService();

    @POST
    @Path("/")
    public ConfigTypeMemoire add(ConfigTypeMemoire t) throws Exception {
        return configTypeMemoireService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(ConfigTypeMemoire t) throws Exception {
        configTypeMemoireService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(ConfigTypeMemoire t) throws Exception {
        configTypeMemoireService.update(t);
    }

    @GET
    @Path("/{id}")
    public ConfigTypeMemoire getById(@PathParam("id") Long l) throws Exception {
        return configTypeMemoireService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return configTypeMemoireService.getCount();
    }

    @GET
    @Path("/")
    public List<ConfigTypeMemoire> getAll() throws Exception {
        return configTypeMemoireService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<ConfigTypeMemoire> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return configTypeMemoireService.getAll(i, i1);
    }

}
