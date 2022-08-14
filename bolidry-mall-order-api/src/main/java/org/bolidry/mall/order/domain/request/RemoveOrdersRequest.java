package org.bolidry.mall.order.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author ZhuPengWei
 * @date 2022-08-14 13:05
 */
@Data
public class RemoveOrdersRequest implements Serializable {

    private Set<String> orderIdList;
}
