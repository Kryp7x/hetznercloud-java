package me.tomsdevsn.hetznercloud.objects.response;

import lombok.Data;
import me.tomsdevsn.hetznercloud.objects.general.Server;

@Data
public class ServerResponse {

    private Server server;
}
