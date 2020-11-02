package org.note.user;


public enum ResultCode {

    /**
     * 服务异常
     *
     * 参考 https://www.kancloud.cn/onebase/ob/484204 文章
     *
     * 一共 10 位，分成四段
     *
     * 第一段，1 位，类型
     *      1 - 业务级别异常
     *      2 - 系统级别异常
     * 第二段，3 位，系统类型
     *      001 - 用户系统
     *      002 - 商品系统
     *      003 - 订单系统
     *      004 - 支付系统
     *      005 - 优惠劵系统
     *      ... - ...
     * 第三段，3 位，模块
     *      不限制规则。
     *      一般建议，每个系统里面，可能有多个模块，可以再去做分段。以用户系统为例子：
     *          001 - OAuth2 模块
     *          002 - User 模块
     *          003 - MobileCode 模块
     * 第四段，3 位，错误码
     *       不限制规则。
     *       一般建议，每个模块自增。
     */

    SUCCESS(0, "成功"),
    CONNECT_ERROR(100001, "网络连接失败"),
    CONNECT_TIMEOUT(100002, "网络连接超时"),
    INTERNAL_SERVER_ERROR(100003, "服务器内部错误"),
    QUERY_ERROR(100004, "查询失败"),
    INSERT_ERROR(100005, "保存数据失败"),
    UPDATE_ERROR(100006, "更新数据失败"),
    DELETE_ERROR(100007, "删除数据失败"),
    UNKNOWN_ERROR(100008, "未知错误");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
