import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpServerCodec;

public class HttpServerInitializer extends ChannelInitializer {

	@Override
	protected void initChannel(Channel ch) throws Exception {
		// TODO Auto-generated method stub
		ChannelPipeline pipeline = ch.pipeline();
        //处理http服务的关键handler
        pipeline.addLast("httpServerCodec",new HttpServerCodec());
        //自定义的handler
        pipeline.addLast("testHttpServerHandler",new HttpServerHandler());
		
	}

}
