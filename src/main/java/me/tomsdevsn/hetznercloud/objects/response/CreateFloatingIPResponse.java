package me.tomsdevsn.hetznercloud.objects.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import me.tomsdevsn.hetznercloud.objects.general.Action;
import me.tomsdevsn.hetznercloud.objects.general.FloatingIP;

@Data
public class CreateFloatingIPResponse {

    @JsonProperty("floating_ip")
    private FloatingIP floatingIP;
    private Action action;
}
