// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XKeyReleasedEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("root"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("subwindow"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("time"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("x_root"),
        Constants$root.C_INT$LAYOUT.withName("y_root"),
        Constants$root.C_INT$LAYOUT.withName("state"),
        Constants$root.C_INT$LAYOUT.withName("keycode"),
        Constants$root.C_INT$LAYOUT.withName("same_screen"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XKeyReleasedEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XKeyReleasedEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XKeyReleasedEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XKeyReleasedEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XKeyReleasedEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XKeyReleasedEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XKeyReleasedEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XKeyReleasedEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XKeyReleasedEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XKeyReleasedEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XKeyReleasedEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XKeyReleasedEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XKeyReleasedEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XKeyReleasedEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XKeyReleasedEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XKeyReleasedEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XKeyReleasedEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XKeyReleasedEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return XKeyReleasedEvent.root$VH;
    }
    public static long root$get(MemorySegment seg) {
        return (long)XKeyReleasedEvent.root$VH.get(seg);
    }
    public static void root$set( MemorySegment seg, long x) {
        XKeyReleasedEvent.root$VH.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)XKeyReleasedEvent.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        XKeyReleasedEvent.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle subwindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("subwindow"));
    public static VarHandle subwindow$VH() {
        return XKeyReleasedEvent.subwindow$VH;
    }
    public static long subwindow$get(MemorySegment seg) {
        return (long)XKeyReleasedEvent.subwindow$VH.get(seg);
    }
    public static void subwindow$set( MemorySegment seg, long x) {
        XKeyReleasedEvent.subwindow$VH.set(seg, x);
    }
    public static long subwindow$get(MemorySegment seg, long index) {
        return (long)XKeyReleasedEvent.subwindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow$set(MemorySegment seg, long index, long x) {
        XKeyReleasedEvent.subwindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XKeyReleasedEvent.time$VH;
    }
    public static long time$get(MemorySegment seg) {
        return (long)XKeyReleasedEvent.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, long x) {
        XKeyReleasedEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XKeyReleasedEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XKeyReleasedEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XKeyReleasedEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XKeyReleasedEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return XKeyReleasedEvent.x_root$VH;
    }
    public static int x_root$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.x_root$VH.get(seg);
    }
    public static void x_root$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.x_root$VH.set(seg, x);
    }
    public static int x_root$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return XKeyReleasedEvent.y_root$VH;
    }
    public static int y_root$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.y_root$VH.get(seg);
    }
    public static void y_root$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.y_root$VH.set(seg, x);
    }
    public static int y_root$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.y_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return XKeyReleasedEvent.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keycode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keycode"));
    public static VarHandle keycode$VH() {
        return XKeyReleasedEvent.keycode$VH;
    }
    public static int keycode$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.keycode$VH.get(seg);
    }
    public static void keycode$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.keycode$VH.set(seg, x);
    }
    public static int keycode$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.keycode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keycode$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.keycode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle same_screen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("same_screen"));
    public static VarHandle same_screen$VH() {
        return XKeyReleasedEvent.same_screen$VH;
    }
    public static int same_screen$get(MemorySegment seg) {
        return (int)XKeyReleasedEvent.same_screen$VH.get(seg);
    }
    public static void same_screen$set( MemorySegment seg, int x) {
        XKeyReleasedEvent.same_screen$VH.set(seg, x);
    }
    public static int same_screen$get(MemorySegment seg, long index) {
        return (int)XKeyReleasedEvent.same_screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void same_screen$set(MemorySegment seg, long index, int x) {
        XKeyReleasedEvent.same_screen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


