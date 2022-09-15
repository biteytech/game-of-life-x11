// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XClientMessageEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("message_type"),
        Constants$root.C_INT$LAYOUT.withName("format"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("b"),
            MemoryLayout.sequenceLayout(10, Constants$root.C_SHORT$LAYOUT).withName("s"),
            MemoryLayout.sequenceLayout(5, Constants$root.C_LONG_LONG$LAYOUT).withName("l")
        ).withName("data")
    );
    public static MemoryLayout $LAYOUT() {
        return XClientMessageEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XClientMessageEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XClientMessageEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XClientMessageEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XClientMessageEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XClientMessageEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XClientMessageEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XClientMessageEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XClientMessageEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XClientMessageEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XClientMessageEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XClientMessageEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XClientMessageEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XClientMessageEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XClientMessageEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XClientMessageEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XClientMessageEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XClientMessageEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XClientMessageEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XClientMessageEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XClientMessageEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XClientMessageEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XClientMessageEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XClientMessageEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XClientMessageEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XClientMessageEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle message_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("message_type"));
    public static VarHandle message_type$VH() {
        return XClientMessageEvent.message_type$VH;
    }
    public static long message_type$get(MemorySegment seg) {
        return (long)XClientMessageEvent.message_type$VH.get(seg);
    }
    public static void message_type$set( MemorySegment seg, long x) {
        XClientMessageEvent.message_type$VH.set(seg, x);
    }
    public static long message_type$get(MemorySegment seg, long index) {
        return (long)XClientMessageEvent.message_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void message_type$set(MemorySegment seg, long index, long x) {
        XClientMessageEvent.message_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle format$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("format"));
    public static VarHandle format$VH() {
        return XClientMessageEvent.format$VH;
    }
    public static int format$get(MemorySegment seg) {
        return (int)XClientMessageEvent.format$VH.get(seg);
    }
    public static void format$set( MemorySegment seg, int x) {
        XClientMessageEvent.format$VH.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)XClientMessageEvent.format$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        XClientMessageEvent.format$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class data {

        static final  GroupLayout data$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("b"),
            MemoryLayout.sequenceLayout(10, Constants$root.C_SHORT$LAYOUT).withName("s"),
            MemoryLayout.sequenceLayout(5, Constants$root.C_LONG_LONG$LAYOUT).withName("l")
        );
        public static MemoryLayout $LAYOUT() {
            return data.data$union$LAYOUT;
        }
        public static MemorySegment b$slice(MemorySegment seg) {
            return seg.asSlice(0, 20);
        }
        public static MemorySegment s$slice(MemorySegment seg) {
            return seg.asSlice(0, 20);
        }
        public static MemorySegment l$slice(MemorySegment seg) {
            return seg.asSlice(0, 40);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(56, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


