package com.hexaware.MLP178.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP178.model.Wallet;
import com.hexaware.MLP178.factory.WalletFactory;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/wallet")
public class WalletRest {
  /**
   * Returns Wallet details.
   * @return the Wallet details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Wallet[] listWallet() {
    final Wallet[] wallet = WalletFactory.showWallet();
    return wallet;
  }
 /**
   * Returns Wallet details.
   * @param custId to get name.
   * @return the Wallet details
   */
  @GET
  @Path("{custId}")
  @Produces(MediaType.APPLICATION_JSON)
  public final Wallet[] walletName(@PathParam("custId") final int custId) {
    final Wallet[] venName = WalletFactory.showByWallet(custId);
    return venName;
  }
}
